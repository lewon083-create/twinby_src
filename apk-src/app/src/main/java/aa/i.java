package aa;

import com.google.android.gms.internal.ads.c31;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements c31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i f595b = new i(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i f596c = new i(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f597a;

    public /* synthetic */ i(int i) {
        this.f597a = i;
    }

    @Override // com.google.android.gms.internal.ads.c31
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f597a) {
            case 0:
                ArrayList arrayList = l.I;
                return ((JSONObject) obj).optString("nas");
            default:
                ArrayList arrayList2 = l.I;
                u9.i.f("", (Exception) obj);
                return null;
        }
    }
}
