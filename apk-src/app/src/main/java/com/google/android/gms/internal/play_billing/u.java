package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f14323c = new u(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f14324d = new u(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14325b;

    public /* synthetic */ u(int i) {
        this.f14325b = i;
    }

    @Override // com.google.android.gms.internal.play_billing.v
    public final int a(v vVar) {
        switch (this.f14325b) {
            case 0:
                return vVar == this ? 0 : 1;
            default:
                return vVar == this ? 0 : -1;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.v
    public final void b(StringBuilder sb2) {
        switch (this.f14325b) {
            case 0:
                throw new AssertionError();
            default:
                sb2.append("(-∞");
                return;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.v
    public final void c(StringBuilder sb2) {
        switch (this.f14325b) {
            case 0:
                sb2.append("+∞)");
                return;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        switch (this.f14325b) {
            case 0:
                return ((v) obj) == this ? 0 : 1;
            default:
                return ((v) obj) == this ? 0 : -1;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.v
    public final int hashCode() {
        switch (this.f14325b) {
        }
        return System.identityHashCode(this);
    }

    public final String toString() {
        switch (this.f14325b) {
            case 0:
                return "+∞";
            default:
                return "-∞";
        }
    }
}
