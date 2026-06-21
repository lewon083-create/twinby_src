package z2;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends com.google.android.gms.internal.auth.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f45917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f45918d;

    public o(p pVar, r rVar) {
        this.f45918d = pVar;
        this.f45917c = rVar;
    }

    @Override // com.google.android.gms.internal.auth.m
    public final View o(int i) {
        r rVar = this.f45917c;
        if (rVar.p()) {
            return rVar.o(i);
        }
        Dialog dialog = this.f45918d.f45930g0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.auth.m
    public final boolean p() {
        return this.f45917c.p() || this.f45918d.f45933k0;
    }
}
