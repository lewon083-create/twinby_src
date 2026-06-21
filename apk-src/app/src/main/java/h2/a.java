package h2;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f20345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20346d;

    public a(int i, f fVar, int i10) {
        this.f20344b = i;
        this.f20345c = fVar;
        this.f20346d = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f20344b);
        this.f20345c.f20360a.performAction(this.f20346d, bundle);
    }
}
