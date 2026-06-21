package s9;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageButton f32856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f32857c;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(android.content.Context r7, com.google.android.gms.internal.ads.nl0 r8, s9.d r9) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.m.<init>(android.content.Context, com.google.android.gms.internal.ads.nl0, s9.d):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d dVar = this.f32857c;
        if (dVar != null) {
            dVar.f32828x = 2;
            dVar.f32808c.finish();
        }
    }
}
