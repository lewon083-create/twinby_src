package m;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f28299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f28300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f28301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f28302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f28303e;

    public m2(View view) {
        this.f28299a = (TextView) view.findViewById(R.id.text1);
        this.f28300b = (TextView) view.findViewById(R.id.text2);
        this.f28301c = (ImageView) view.findViewById(R.id.icon1);
        this.f28302d = (ImageView) view.findViewById(R.id.icon2);
        this.f28303e = (ImageView) view.findViewById(com.twinby.R.id.edit_query);
    }
}
