package i7;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21195a = 0;

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (Intrinsics.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return Intrinsics.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list != null && list2 != null && list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (a((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public final f7.k c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new f7.k(b0.f27475b);
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        b.d(sidecarDeviceState, b.b(state));
        return new f7.k(d(b.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    public final ArrayList d(List sidecarDisplayFeatures, SidecarDeviceState deviceState) {
        Intrinsics.checkNotNullParameter(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            f7.c cVarE = e((SidecarDisplayFeature) it.next(), deviceState);
            if (cVarE != null) {
                arrayList.add(cVarE);
            }
        }
        return arrayList;
    }

    public final f7.c e(SidecarDisplayFeature feature, SidecarDeviceState deviceState) {
        f7.b bVar;
        f7.b bVar2 = f7.b.f16668f;
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        Intrinsics.checkNotNullExpressionValue("g", "TAG");
        Intrinsics.checkNotNullParameter(feature, "<this>");
        Intrinsics.checkNotNullParameter("g", "tag");
        c7.h verificationMode = c7.h.f2242b;
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        c7.a logger = c7.a.f2224a;
        Intrinsics.checkNotNullParameter(logger, "logger");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) new c7.g(feature, verificationMode, logger).y("Type must be either TYPE_FOLD or TYPE_HINGE", c.f21191f).y("Feature bounds must not be 0", d.f21192f).y("TYPE_FOLD must have 0 area", e.f21193f).y("Feature be pinned to either left or top", f.f21194f).e();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVar = f7.b.f16670h;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = f7.b.i;
        }
        int iB = b.b(deviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            bVar2 = f7.b.f16669g;
        } else if (iB != 3 && iB == 4) {
            return null;
        }
        Rect rect = feature.getRect();
        Intrinsics.checkNotNullExpressionValue(rect, "feature.rect");
        return new f7.c(new c7.b(rect), bVar, bVar2);
    }
}
