
package strategy;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
class transporte{
    private Via estrategia;

    public void setEstrategia(Via estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutarDistribucion() {
        estrategia.distribuir();
    }
}