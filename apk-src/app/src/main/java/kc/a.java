package kc;

import a7.l;
import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.d4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends d4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Typeface f27354h;
    public final l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f27355j;

    public a(l lVar, Typeface typeface) {
        this.f27354h = typeface;
        this.i = lVar;
    }

    @Override // com.google.android.gms.internal.measurement.d4
    public final void s(int i) {
        if (this.f27355j) {
            return;
        }
        ic.b bVar = (ic.b) this.i.f491c;
        if (bVar.j(this.f27354h)) {
            bVar.h(false);
        }
    }

    @Override // com.google.android.gms.internal.measurement.d4
    public final void t(Typeface typeface, boolean z5) {
        if (this.f27355j) {
            return;
        }
        ic.b bVar = (ic.b) this.i.f491c;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}
