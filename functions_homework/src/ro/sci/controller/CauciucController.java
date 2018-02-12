package ro.sci.controller;

import ro.sci.domain.Cauciuc;
import ro.sci.domain.SearchRequest;
import ro.sci.service.SearchCauciucService;

public class CauciucController {

    private SearchCauciucService searchCauciucService = new SearchCauciucService();

    public Cauciuc handleSearchRequest(SearchRequest searchRequest) {
        Cauciuc cauciuc = this.searchCauciucService.search(searchRequest);
        return cauciuc;
    }

}
