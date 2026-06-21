package xl;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Pattern f36281b;

    public /* synthetic */ l(int i) {
        this.f36280a = i;
    }

    @Override // xl.m
    public final boolean a(vl.k kVar, vl.k kVar2) {
        switch (this.f36280a) {
            case 0:
                Pattern pattern = this.f36281b;
                kVar2.getClass();
                StringBuilder sb2 = new StringBuilder();
                rl.b.v(new m7.a(24, sb2), kVar2);
                return pattern.matcher(sb2.toString().trim()).find();
            default:
                return this.f36281b.matcher(kVar2.z()).find();
        }
    }

    public final String toString() {
        switch (this.f36280a) {
            case 0:
                return ":matches(" + this.f36281b + ")";
            default:
                return ":matchesOwn(" + this.f36281b + ")";
        }
    }
}
