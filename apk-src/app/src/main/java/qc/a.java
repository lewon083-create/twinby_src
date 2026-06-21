package qc;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f31997b;

    public /* synthetic */ a(n nVar, int i) {
        this.f31996a = i;
        this.f31997b = nVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z5) {
        switch (this.f31996a) {
            case 0:
                d dVar = (d) this.f31997b;
                dVar.s(dVar.t());
                break;
            default:
                j jVar = (j) this.f31997b;
                jVar.f32022l = z5;
                jVar.p();
                if (!z5) {
                    jVar.s(false);
                    jVar.f32023m = false;
                }
                break;
        }
    }
}
