package u6;

import android.view.View;
import com.google.android.gms.internal.ads.om1;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f34310b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f34309a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f34311c = new ArrayList();

    public z(View view) {
        this.f34310b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f34310b == zVar.f34310b && this.f34309a.equals(zVar.f34309a);
    }

    public final int hashCode() {
        return this.f34309a.hashCode() + (this.f34310b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbK = pe.a.k("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbK.append(this.f34310b);
        sbK.append("\n");
        String strX = om1.x(sbK.toString(), "    values:");
        HashMap map = this.f34309a;
        for (String str : map.keySet()) {
            strX = strX + "    " + str + ": " + map.get(str) + "\n";
        }
        return strX;
    }
}
