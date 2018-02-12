package ro.sci.service;

import ro.sci.domain.Cauciuc;

public class CauciucService {

    private Cauciuc[] cauciucs;

    public CauciucService() {
        initLocalCauciucs();
    }

    public Cauciuc findCauciuc(String typeOfCauciuc) {
        Cauciuc foundCauciuc = null;
        for (Cauciuc cauciuc : cauciucs) {
            if (typeOfCauciuc != null && typeOfCauciuc.equals(cauciuc.typeOfCauciuc)) {
                foundCauciuc = cauciuc;
                break;
            }
        }
        return foundCauciuc;
    }

    private void initLocalCauciucs() {
        Cauciuc c1 = new Cauciuc("winter");
        c1.sizeOfCauciuc = "225/65";

        Cauciuc c2 = new Cauciuc("summer");
        c2.sizeOfCauciuc = "215/55";

        cauciucs = new Cauciuc[]{c1, c2};

    }

}
