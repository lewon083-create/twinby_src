package yads;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ej1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tg1 f38146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f38147b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38148c;

    public ej1(tg1 tg1Var) {
        this.f38146a = tg1Var;
    }

    public final String a() {
        String str;
        synchronized (this.f38147b) {
            try {
                if (this.f38148c == null) {
                    this.f38148c = ((vg1) this.f38146a).c("YmadMauid");
                }
                str = this.f38148c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final void a(String str) {
        synchronized (this.f38147b) {
            this.f38148c = str;
            ((vg1) this.f38146a).a("YmadMauid", str);
            Unit unit = Unit.f27471a;
        }
    }
}
