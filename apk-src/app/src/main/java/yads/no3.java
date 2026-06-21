package yads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class no3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41319f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41321h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f41327o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41314a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41315b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f41316c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f41317d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f41318e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41320g = false;
    public boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f41322j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41323k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f41324l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41325m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41326n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f41328p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f41329q = false;

    public final int a(String str, String str2, Set set, String str3) {
        if (this.f41314a.isEmpty() && this.f41315b.isEmpty() && this.f41316c.isEmpty() && this.f41317d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        String str4 = this.f41314a;
        int i = !str4.isEmpty() ? str4.equals(str) ? 1073741824 : -1 : 0;
        String str5 = this.f41315b;
        if (!str5.isEmpty() && i != -1) {
            i = str5.equals(str2) ? i + 2 : -1;
        }
        String str6 = this.f41317d;
        if (!str6.isEmpty() && i != -1) {
            i = str6.equals(str3) ? i + 4 : -1;
        }
        if (i == -1 || !set.containsAll(this.f41316c)) {
            return 0;
        }
        return (this.f41316c.size() * 4) + i;
    }
}
