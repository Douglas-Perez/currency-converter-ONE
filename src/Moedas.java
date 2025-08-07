public record Moedas(double USD, double BRL, double ARS, double BOB, double CLP, double COP) {
    public double getTaxa(String codigo) {
        return switch (codigo) {
            case "USD" -> USD;
            case "BRL" -> BRL;
            case "ARS" -> ARS;
            case "BOB" -> BOB;
            case "CLP" -> CLP;
            case "COP" -> COP;
            default -> throw new IllegalArgumentException("Código de moeda inválido: " + codigo);
        };
    }
}