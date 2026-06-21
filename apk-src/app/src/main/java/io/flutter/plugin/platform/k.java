package io.flutter.plugin.platform;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f25702c;

    public /* synthetic */ k(j jVar, int i, int i10) {
        this.f25700a = i10;
        this.f25702c = jVar;
        this.f25701b = i;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z5) {
        switch (this.f25700a) {
            case 0:
                q qVar = (q) this.f25702c;
                int i = this.f25701b;
                if (!z5) {
                    io.flutter.plugin.editing.i iVar = qVar.f25734h;
                    if (iVar != null) {
                        iVar.b(i);
                    }
                    break;
                } else {
                    ii.q qVar2 = (ii.q) qVar.i.f20375c;
                    if (qVar2 != null) {
                        qVar2.a("viewFocused", Integer.valueOf(i), null);
                        break;
                    }
                }
                break;
            default:
                p pVar = (p) this.f25702c;
                int i10 = this.f25701b;
                if (!z5) {
                    io.flutter.plugin.editing.i iVar2 = pVar.f25717g;
                    if (iVar2 != null) {
                        iVar2.b(i10);
                    }
                    break;
                } else {
                    ii.q qVar3 = (ii.q) pVar.f25718h.f20375c;
                    if (qVar3 != null) {
                        qVar3.a("viewFocused", Integer.valueOf(i10), null);
                        break;
                    }
                }
                break;
        }
    }
}
