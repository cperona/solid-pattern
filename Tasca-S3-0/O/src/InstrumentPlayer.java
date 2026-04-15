public class InstrumentPlayer {
    public static void main(String[] args) {
        Instrument guitar = new GuitarInstrument();
        Instrument drums = new DrumInstrument();
        Instrument piano = new PianoInstrument();
        Instrument unknownInstrument = new UnknownInstrument();

        guitar.play();
        drums.play();
        piano.play();
        unknownInstrument.play();
    }
}