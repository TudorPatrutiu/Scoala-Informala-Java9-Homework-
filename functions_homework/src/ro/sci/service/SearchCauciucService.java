package ro.sci.service;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.SearchRequest;

public class SearchCauciucService {

    private CauciucService cauciucService = new CauciucService();

    public Cauciuc search(SearchRequest searchRequest) {
        Cauciuc validCauciuc = null;

        if (searchRequest != null) {
            Cauciuc cauciuc = this.cauciucService.findCauciuc(searchRequest.typeOfCauciuc);

            if (cauciuc != null && isSizeofCauciucMatching(searchRequest.size, cauciuc)) {
                validCauciuc = cauciuc;
            }
        }
        return validCauciuc;
    }

    private boolean isSizeofCauciucMatching(String size, Cauciuc cauciuc) {
        return size != null && size.equals(cauciuc.sizeOfCauciuc);
    }

}
