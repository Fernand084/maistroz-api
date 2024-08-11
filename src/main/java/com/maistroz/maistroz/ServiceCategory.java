package com.maistroz.maistroz;


public enum ServiceCategory {
	ALBANILERIA("Albañilería"),
    JARDINERIA("Jardinería"),
    PLOMERIA("Plomería"),
    HERRERIA("Herrería"),
    ELECTRICIDAD("Electricidad"),
    PINTURA("Pintura"),
    CARPINTERIA("Carpintería"),
    LIMPIEZA("Limpieza"),
    MANTENIMIENTO("Mantenimiento"),
    FONTANERIA("Fontanería"),
    REFRIGERACION("Refrigeración"),
    AIRE_ACONDICIONADO("Aire Acondicionado"),
    CONSTRUCCION("Construcción"),
    TAPICERIA("Tapicería"),
    VIDRIERIA("Vidriería"),
    PISOS("Pisos"),
    CERRAJERIA("Cerrajería"),
    MUDANZAS("Mudanzas"),
    FUMIGACION("Fumigación"),
    ELECTRONICA("Electrónica");


    private ServiceCategory(String name) {
        this.name = name;
    }
    
    public final String name;

    public String getName() {
        return name;
    }
    
    
}
