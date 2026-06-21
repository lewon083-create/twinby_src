package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xt implements qg2 {
    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        pg2.b(i, length);
        while (i < length) {
            if (a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean a(char c8);

    @Override // yads.qg2
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
