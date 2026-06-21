package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43745d;

    public uo(int i, int i10, String str, String str2) {
        this.f43742a = str;
        this.f43743b = str2;
        this.f43744c = i;
        this.f43745d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        return this.f43744c == uoVar.f43744c && this.f43745d == uoVar.f43745d && n92.a(this.f43742a, uoVar.f43742a) && n92.a(this.f43743b, uoVar.f43743b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43742a, this.f43743b, Integer.valueOf(this.f43744c), Integer.valueOf(this.f43745d)});
    }
}
