package com.maistroz.maistroz;

public enum StateMx {
    AGUASCALIENTES("Aguascalientes"),
    BAJA_CALIFORNIA("Baja California"),
    BAJA_CALIFORNIA_SUR("Baja California Sur"),
    CAMPECHE("Campeche"),
    CHIAPAS("Chiapas"),
    CHIHUAHUA("Chihuahua"),
    COAHUILA("Coahuila"),
    COLIMA("Colima"),
    DURANGO("Durango"),
    GUANAJUATO("Guanajuato"),
    GUERRERO("Guerrero"),
    HIDALGO("Hidalgo"),
    JALISCO("Jalisco"),
    MEXICO_CIUDAD("Ciudad de México"),
    MEXICO_ESTADO("Estado de México"),
    MICHOACAN("Michoacán"),
    MORELOS("Morelos"),
    NAYARIT("Nayarit"),
    NUEVO_LEON("Nuevo León"),
    OAXACA("Oaxaca"),
    PUEBLA("Puebla"),
    QUERETARO("Querétaro"),
    QUINTANA_ROO("Quintana Roo"),
    SAN_LUIS_POTOSI("San Luis Potosí"),
    SINALOA("Sinaloa"),
    SONORA("Sonora"),
    TABASCO("Tabasco"),
    TAMAULIPAS("Tamaulipas"),
    TLAXCALA("Tlaxcala"),
    VERACRUZ("Veracruz"),
    YUCATAN("Yucatán"),
    ZACATECAS("Zacatecas");

    private StateMx(String name) {
        this.name = name;
    }
    
	public final String name;

    public String getName() {
        return name;
    }
}
