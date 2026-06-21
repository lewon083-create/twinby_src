package yads;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l73 implements xq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l73 f40442e = new l73(new k73[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wq f40443f = new zl.g0(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final um2 f40445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40446d;

    public l73(k73... k73VarArr) {
        this.f40445c = r51.b(k73VarArr);
        this.f40444b = k73VarArr.length;
        a();
    }

    public final k73 a(int i) {
        return (k73) this.f40445c.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l73.class == obj.getClass()) {
            l73 l73Var = (l73) obj;
            if (this.f40444b == l73Var.f40444b && this.f40445c.equals(l73Var.f40445c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f40446d == 0) {
            this.f40446d = this.f40445c.hashCode();
        }
        return this.f40446d;
    }

    public static l73 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return parcelableArrayList == null ? new l73(new k73[0]) : new l73((k73[]) yq.a(k73.f40094g, parcelableArrayList).toArray(new k73[0]));
    }

    public final void a() {
        int i = 0;
        while (i < this.f40445c.size()) {
            int i10 = i + 1;
            for (int i11 = i10; i11 < this.f40445c.size(); i11++) {
                if (((k73) this.f40445c.get(i)).equals(this.f40445c.get(i11))) {
                    kh1.a("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i10;
        }
    }
}
