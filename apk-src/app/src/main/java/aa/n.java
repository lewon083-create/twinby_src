package aa;

import com.google.android.gms.internal.ads.gr;
import com.google.android.gms.internal.ads.ms1;
import com.google.android.gms.internal.ads.ti;
import com.google.android.gms.internal.ads.tw;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bb.e f662b;

    public /* synthetic */ n(bb.e eVar, int i) {
        this.f661a = i;
        this.f662b = eVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f661a) {
            case 0:
                String str = (String) this.f662b.f2019c;
                switch (str.hashCode()) {
                    case -1999289321:
                        if (str.equals("NATIVE")) {
                            return ti.AD_LOADER;
                        }
                        break;
                    case -1372958932:
                        if (str.equals("INTERSTITIAL")) {
                            return ti.INTERSTITIAL;
                        }
                        break;
                    case 543046670:
                        if (str.equals("REWARDED")) {
                            return ti.REWARD_BASED_VIDEO_AD;
                        }
                        break;
                    case 1951953708:
                        if (str.equals("BANNER")) {
                            return ti.BANNER;
                        }
                        break;
                }
                return ti.AD_INITIATER_UNSPECIFIED;
            case 1:
                String lowerCase = ((String) this.f662b.f2019c).toLowerCase(Locale.ROOT);
                gr.G(lowerCase);
                return lowerCase;
            case 2:
                bb.e eVar = this.f662b;
                eVar.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(((String) eVar.f2019c).toLowerCase(Locale.ROOT));
                return hashSet;
            case 3:
                return (String) this.f662b.f2020d;
            default:
                return (tw) this.f662b.f2021e;
        }
    }
}
