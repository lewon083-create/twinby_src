package qc;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends ic.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f32029b;

    public k(m mVar) {
        this.f32029b = mVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f32029b.b().a();
    }

    @Override // ic.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        this.f32029b.b().b();
    }
}
