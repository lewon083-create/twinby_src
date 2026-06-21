package qc;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f32010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(m mVar, int i) {
        super(mVar);
        this.f32010e = i;
    }

    @Override // qc.n
    public void q() {
        switch (this.f32010e) {
            case 0:
                m mVar = this.f32053b;
                mVar.f32044p = null;
                CheckableImageButton checkableImageButton = mVar.f32037h;
                checkableImageButton.setOnLongClickListener(null);
                k3.f.B(checkableImageButton, null);
                break;
        }
    }
}
