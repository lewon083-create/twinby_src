package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v01 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f43815a;

    public v01(View view) {
        super(view);
        this.f43815a = (TextView) view.findViewById(R$id.item_text);
    }

    @Override // yads.ea0
    public final void a(ba0 ba0Var) {
        this.f43815a.setText(((w90) ba0Var).f44309a);
    }
}
