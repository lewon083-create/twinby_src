package yads;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hh implements StartupParamsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dh f39187a;

    public hh(dh dhVar) {
        this.f39187a = dhVar;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        ArrayList arrayList;
        Map<String, StartupParamsItem> map;
        StartupParamsItem startupParamsItem;
        Map<String, StartupParamsItem> map2;
        StartupParamsItem startupParamsItem2;
        Map<String, StartupParamsItem> map3;
        StartupParamsItem startupParamsItem3;
        dh dhVar = this.f39187a;
        String id2 = null;
        String id3 = (result == null || (map3 = result.parameters) == null || (startupParamsItem3 = map3.get(StartupParamsCallback.APPMETRICA_UUID)) == null) ? null : startupParamsItem3.getId();
        String id4 = (result == null || (map2 = result.parameters) == null || (startupParamsItem2 = map2.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)) == null) ? null : startupParamsItem2.getId();
        if (result != null && (map = result.parameters) != null && (startupParamsItem = map.get("appmetrica_get_ad_url")) != null) {
            id2 = startupParamsItem.getId();
        }
        wg wgVar = (wg) dhVar;
        wgVar.getClass();
        wgVar.c();
        ug ugVar = wgVar.f44380a;
        tg tgVar = new tg(id2, id4, id3);
        synchronized (ugVar.f43643a) {
            arrayList = new ArrayList(ugVar.f43644b);
            ugVar.f43644b.clear();
            Unit unit = Unit.f27471a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d31) it.next()).a(tgVar);
        }
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        dh dhVar = this.f39187a;
        ch chVar = Intrinsics.a(reason, StartupParamsCallback.Reason.NETWORK) ? ch.f37394c : Intrinsics.a(reason, StartupParamsCallback.Reason.INVALID_RESPONSE) ? ch.f37395d : ch.f37393b;
        wg wgVar = (wg) dhVar;
        wgVar.c();
        wgVar.f44383d.f42594a.getClass();
        String str = (String) sg.f42931a.get(chVar);
        if (str == null) {
            str = "Unknown";
        }
        rg.a(str);
        wgVar.a();
    }
}
