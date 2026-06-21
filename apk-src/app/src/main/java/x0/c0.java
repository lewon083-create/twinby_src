package x0;

import android.util.Size;
import g0.a2;
import g0.b1;
import g0.c1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f35566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f35568d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f35569e = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public c0(g0.d0 cameraInfo, int i) {
        b1 aVar;
        boolean z5 = true;
        int i10 = i == 2 ? 2 : 1;
        this.f35567c = i10;
        b1 b1VarP = cameraInfo.p();
        if (i10 == 2) {
            aVar = b1VarP;
            if (!cameraInfo.k()) {
                aVar = b1.M1;
            }
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            TreeMap treeMap = new TreeMap(new i0.f(false));
            g gVar = g.f35584e;
            for (g gVar2 : new ArrayList(g.f35591m)) {
                f2.g.h("Currently only support ConstantQuality", gVar2 instanceof g);
                c1 c1VarU = b1VarP.u(gVar2.a(i10));
                if (c1VarU != null) {
                    com.google.android.gms.internal.auth.g.e("CapabilitiesByQuality", "profiles = " + c1VarU);
                    z0.a aVar2 = null;
                    if (!c1VarU.d().isEmpty()) {
                        int iA = c1VarU.a();
                        int iB = c1VarU.b();
                        List listC = c1VarU.c();
                        List listD = c1VarU.d();
                        f2.g.a("Should contain at least one VideoProfile.", listD.isEmpty() ^ z5);
                        aVar2 = new z0.a(iA, iB, Collections.unmodifiableList(new ArrayList(listC)), Collections.unmodifiableList(new ArrayList(listD)), listC.isEmpty() ? null : (g0.h) listC.get(0), (g0.j) listD.get(0));
                    }
                    if (aVar2 == null) {
                        com.google.android.gms.internal.auth.g.O("CapabilitiesByQuality", "EncoderProfiles of quality " + gVar2 + " has no video validated profiles.");
                    } else {
                        treeMap.put(aVar2.f45781f.a(), gVar2);
                        linkedHashMap.put(gVar2, aVar2);
                    }
                    z5 = true;
                }
            }
            if (linkedHashMap.isEmpty()) {
                com.google.android.gms.internal.auth.g.k("CapabilitiesByQuality", "No supported EncoderProfiles");
            } else {
                ArrayDeque arrayDeque = new ArrayDeque(linkedHashMap.values());
            }
            b1 b1Var = b1VarP;
            if (new ArrayList(linkedHashMap.keySet()).isEmpty()) {
                com.google.android.gms.internal.auth.g.O("RecorderVideoCapabilities", "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
                List targetQualities = Arrays.asList(g.f35586g, g.f35585f, g.f35584e);
                e1.i0 videoEncoderInfoFinder = e1.j0.f15973d;
                Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
                Intrinsics.checkNotNullParameter(targetQualities, "targetQualities");
                Intrinsics.checkNotNullParameter(videoEncoderInfoFinder, "videoEncoderInfoFinder");
                com.google.firebase.messaging.y yVar = new com.google.firebase.messaging.y();
                yVar.f14899b = cameraInfo;
                yVar.f14900c = targetQualities;
                yVar.f14901d = ij.h.b(new androidx.lifecycle.q0(3, yVar));
                yVar.f14902e = new LinkedHashMap();
                b1Var = yVar;
            }
            a2 a2Var = c1.a.f2187a;
            ka.k kVar = new ka.k(new a1.e(cameraInfo, b1Var, a2Var), a2Var);
            Iterator it = cameraInfo.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a0.i0 i0Var = (a0.i0) it.next();
                Integer numValueOf = Integer.valueOf(i0Var.f117a);
                int i11 = i0Var.f118b;
                if (numValueOf.equals(3) && i11 == 10) {
                    kVar = new u7.f(kVar);
                    break;
                }
            }
            aVar = new g1.a(cameraInfo, kVar, a2Var);
        }
        this.f35566b = aVar;
        for (a0.i0 i0Var2 : cameraInfo.a()) {
            l lVar = new l(new x7.b(this.f35566b, i0Var2), this.f35567c);
            if (!new ArrayList(lVar.f35642a.keySet()).isEmpty()) {
                this.f35568d.put(i0Var2, lVar);
            }
        }
        cameraInfo.d();
    }

    @Override // x0.f0
    public final Set a() {
        return this.f35568d.keySet();
    }

    @Override // x0.f0
    public final z0.a b(Size size, a0.i0 i0Var) {
        Object value;
        l lVarE = e(i0Var);
        z0.a aVarA = null;
        if (lVarE == null) {
            return null;
        }
        TreeMap treeMap = lVarE.f35643b;
        Size size2 = p0.b.f30754a;
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        g gVar = (g) value;
        if (gVar == null) {
            gVar = g.f35589k;
        }
        com.google.android.gms.internal.auth.g.e("CapabilitiesByQuality", "Using supported quality of " + gVar + " for size " + size);
        if (gVar == g.f35589k || (aVarA = lVarE.a(gVar)) != null) {
            return aVarA;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    @Override // x0.f0
    public final ArrayList c(a0.i0 i0Var) {
        l lVarE = e(i0Var);
        return lVarE == null ? new ArrayList() : new ArrayList(lVarE.f35642a.keySet());
    }

    @Override // x0.f0
    public final z0.a d(g gVar, a0.i0 i0Var) {
        l lVarE = e(i0Var);
        if (lVarE == null) {
            return null;
        }
        return lVarE.a(gVar);
    }

    public final l e(a0.i0 dynamicRangeToTest) {
        Object next;
        boolean zContains;
        boolean zB = dynamicRangeToTest.b();
        HashMap map = this.f35568d;
        if (zB) {
            return (l) map.get(dynamicRangeToTest);
        }
        HashMap map2 = this.f35569e;
        if (map2.containsKey(dynamicRangeToTest)) {
            return (l) map2.get(dynamicRangeToTest);
        }
        Set fullySpecifiedDynamicRanges = map.keySet();
        Intrinsics.checkNotNullParameter(dynamicRangeToTest, "dynamicRangeToTest");
        Intrinsics.checkNotNullParameter(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangeToTest.b()) {
            zContains = fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        } else {
            Iterator it = fullySpecifiedDynamicRanges.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                a0.i0 i0Var = (a0.i0) next;
                f2.g.h("Fully specified range is not actually fully specified.", i0Var.b());
                int i = dynamicRangeToTest.f118b;
                if (i == 0 || i == i0Var.f118b) {
                    f2.g.h("Fully specified range is not actually fully specified.", i0Var.b());
                    int i10 = dynamicRangeToTest.f117a;
                    if (i10 != 0) {
                        int i11 = i0Var.f117a;
                        if ((i10 == 2 && i11 != 1) || i10 == i11) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            zContains = next != null;
        }
        l lVar = zContains ? new l(new x7.b(this.f35566b, dynamicRangeToTest), this.f35567c) : null;
        map2.put(dynamicRangeToTest, lVar);
        return lVar;
    }
}
