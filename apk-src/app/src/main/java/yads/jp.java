package yads;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vk.c f39926a = ie1.f39520a;

    public static hp a(tg1 tg1Var) {
        Set set = kotlin.collections.d0.f27478b;
        vg1 vg1Var = (vg1) tg1Var;
        Set setA = vg1Var.a("BiddingSettingsAdUnitIdsSet", set);
        if (setA == null) {
            setA = set;
        }
        Set setA2 = vg1Var.a("MediationPrefetchSettingsAdUnitIdsSet", set);
        if (setA2 != null) {
            set = setA2;
        }
        ip ipVar = new ip();
        ArrayList arrayList = new ArrayList(setA.size());
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            String strC = vg1Var.c(a((String) it.next()));
            if (strC != null && strC.length() != 0) {
                try {
                    gb gbVarA = ipVar.a(new JSONObject(strC));
                    if (gbVarA != null) {
                        arrayList.add(gbVarA);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        long jB = vg1Var.b("MediationPrefetchLoadTimeoutMillis");
        ArrayList arrayList2 = new ArrayList(set.size());
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            String strC2 = vg1Var.c(b((String) it2.next()));
            if (strC2 != null) {
                vk.c cVar = f39926a;
                cVar.getClass();
                zr1 zr1Var = (zr1) cVar.a(strC2, com.google.android.gms.internal.auth.g.q(zr1.Companion.serializer()));
                if (zr1Var != null) {
                    arrayList2.add(zr1Var);
                }
            }
        }
        is1 is1Var = new is1(jB, arrayList2);
        if (arrayList.isEmpty() && set.isEmpty()) {
            return null;
        }
        return new hp(arrayList, is1Var);
    }

    public static String b(String str) {
        return com.google.android.gms.internal.ads.om1.k("MediationPrefetchSettingsAdUnitIdsInfo_", str);
    }

    public static void b(tg1 tg1Var) {
        Set set = kotlin.collections.d0.f27478b;
        vg1 vg1Var = (vg1) tg1Var;
        Set setA = vg1Var.a("BiddingSettingsAdUnitIdsSet", set);
        if (setA == null) {
            setA = set;
        }
        Set setA2 = vg1Var.a("MediationPrefetchSettingsAdUnitIdsSet", set);
        if (setA2 != null) {
            set = setA2;
        }
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            vg1Var.d(a((String) it.next()));
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            vg1Var.d(b((String) it2.next()));
        }
        vg1Var.d("BiddingSettingsAdUnitIdsSet");
        vg1Var.d("MediationPrefetchSettingsAdUnitIdsSet");
    }

    public static String a(String str) {
        return com.google.android.gms.internal.ads.om1.k("BiddingSettingsAdUnitIdsInfo_", str);
    }

    public static void a(tg1 tg1Var, hp hpVar) {
        List<zr1> list;
        List<gb> list2 = hpVar.f39289b;
        HashSet hashSet = new HashSet(list2.size());
        for (gb gbVar : list2) {
            String str = gbVar.f38689b;
            String str2 = gbVar.f38691d;
            hashSet.add(str);
            ((vg1) tg1Var).a(a(str), str2);
        }
        Set<String> set = kotlin.collections.d0.f27478b;
        vg1 vg1Var = (vg1) tg1Var;
        Set setA = vg1Var.a("BiddingSettingsAdUnitIdsSet", set);
        if (setA != null) {
            set = setA;
        }
        for (String str3 : set) {
            if (!hashSet.contains(str3)) {
                vg1Var.d(a(str3));
            }
        }
        vg1Var.a("BiddingSettingsAdUnitIdsSet", hashSet);
        is1 is1Var = hpVar.f39290c;
        long j10 = is1Var != null ? is1Var.f39628b : 0L;
        if (is1Var == null || (list = is1Var.f39629c) == null) {
            list = kotlin.collections.b0.f27475b;
        }
        HashSet hashSet2 = new HashSet(list.size());
        for (zr1 zr1Var : list) {
            hashSet2.add(zr1Var.f45524b);
            String strB = b(zr1Var.f45524b);
            vk.c cVar = f39926a;
            cVar.getClass();
            vg1Var.a(strB, cVar.b(zr1.Companion.serializer(), zr1Var));
        }
        Set<String> set2 = kotlin.collections.d0.f27478b;
        Set setA2 = vg1Var.a("MediationPrefetchSettingsAdUnitIdsSet", set2);
        if (setA2 != null) {
            set2 = setA2;
        }
        for (String str4 : set2) {
            if (!hashSet2.contains(str4)) {
                vg1Var.d(b(str4));
            }
        }
        vg1Var.a("MediationPrefetchSettingsAdUnitIdsSet", hashSet2);
        vg1Var.a("MediationPrefetchLoadTimeoutMillis", j10);
    }
}
