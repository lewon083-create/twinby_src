package me;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28876a;

    @Override // me.w
    public final Object a(re.b bVar) {
        switch (this.f28876a) {
            case 0:
                if (bVar.s() != 9) {
                    return Long.valueOf(bVar.nextLong());
                }
                bVar.nextNull();
                return null;
            default:
                if (bVar.s() != 9) {
                    return Float.valueOf((float) bVar.nextDouble());
                }
                bVar.nextNull();
                return null;
        }
    }

    @Override // me.w
    public final void b(re.c cVar, Object obj) throws IOException {
        switch (this.f28876a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    cVar.s(number.toString());
                } else {
                    cVar.i();
                }
                break;
            default:
                Number number2 = (Number) obj;
                if (number2 != null) {
                    k.a(number2.floatValue());
                    cVar.m(number2);
                } else {
                    cVar.i();
                }
                break;
        }
    }
}
