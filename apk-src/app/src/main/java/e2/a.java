package e2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f16013e = new byte[1792];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f16014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f16017d;

    static {
        for (int i = 0; i < 1792; i++) {
            f16013e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f16014a = charSequence;
        this.f16015b = charSequence.length();
    }

    public final byte a() {
        int i = this.f16016c - 1;
        CharSequence charSequence = this.f16014a;
        char cCharAt = charSequence.charAt(i);
        this.f16017d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f16016c);
            this.f16016c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f16016c--;
        char c8 = this.f16017d;
        return c8 < 1792 ? f16013e[c8] : Character.getDirectionality(c8);
    }
}
