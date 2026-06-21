package yads;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f42244a = kotlin.collections.s.f("The integrated version of the Yandex Mobile Ads SDK is outdated.", "Please update com.yandex.android:mobileads to the latest version.");

    public static String a(int i, String str) {
        return t.z.e("* ", str, kotlin.text.a0.k(i - str.length(), " "), " *");
    }

    public static void b() {
        Integer numValueOf;
        ArrayList arrayListL = CollectionsKt.L(CollectionsKt.L(f42244a, kotlin.collections.s.f("Learn more about the latest version of the SDK here:", "https://yandex.ru/dev/mobile-ads/doc/android/quick-start/android-ads-component.html")), a());
        Iterator it = arrayListL.iterator();
        String strI = null;
        if (it.hasNext()) {
            numValueOf = Integer.valueOf(((String) it.next()).length());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((String) it.next()).length());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            String strK = kotlin.text.a0.k(iIntValue + 4, "*");
            ArrayList arrayList = new ArrayList(kotlin.collections.t.j(arrayListL, 10));
            Iterator it2 = arrayListL.iterator();
            while (it2.hasNext()) {
                arrayList.add(a(iIntValue, (String) it2.next()));
            }
            strI = CollectionsKt.I(CollectionsKt.M(CollectionsKt.L(kotlin.collections.r.c(strK), arrayList), strK), "\n", null, null, null, 62);
        }
        Log.e("Yandex Mobile Ads", "Yandex Mobile Ads version validation\n" + strI + "\n");
    }

    public static List a() {
        if (tq.a() != null) {
            return kotlin.collections.r.c("Changelog: " + tq.a());
        }
        return kotlin.collections.b0.f27475b;
    }
}
