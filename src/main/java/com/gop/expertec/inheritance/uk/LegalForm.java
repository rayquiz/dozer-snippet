package com.gop.expertec.inheritance.uk;

public enum LegalForm {

    ARTISAN_COMMERCANT("11", "Artisan-commer�ant"), COMMERCANT("12", "Commer�ant"), ARTISAN("13", "Artisan"), OPM("14",
            "Officier public ou minist�riel"), PROF_LIB("15", "Profession lib�rale"), EXP_AGR("16", "Exploitant agricole"), AGENT_COM("17",
            "Agent commercial"), AGS("18", "Associ� G�rant de soci�t�"), AUTRE("19", "(Autre) personne physique"), INDIVISION("21", "Indivision"), SCF(
            "22", "Soci�t� cr��e de fait"), SEP("23", "Soci�t� en participation"), FIDUCIE("24", "Fiducie");

    private String code;
    private String value;

    private LegalForm(String code, String value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public String toString() {
        return code;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

}
