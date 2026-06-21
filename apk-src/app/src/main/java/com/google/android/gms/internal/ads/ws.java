package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ws extends zd1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f11882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Activity f11883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11885h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f11886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f11887k;

    public ws(sz szVar, Map map) {
        long j10;
        super(6, (Object) szVar, (Object) "createCalendarEvent", false);
        this.f11882e = map;
        this.f11883f = szVar.d();
        this.f11884g = D("description");
        this.f11886j = D("summary");
        String str = (String) map.get("start_ticks");
        long j11 = -1;
        if (str == null) {
            j10 = -1;
        } else {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                j10 = -1;
            }
        }
        this.f11885h = j10;
        String str2 = (String) this.f11882e.get("end_ticks");
        if (str2 != null) {
            try {
                j11 = Long.parseLong(str2);
            } catch (NumberFormatException unused2) {
            }
        }
        this.i = j11;
        this.f11887k = D("location");
    }

    public final String D(String str) {
        Map map = this.f11882e;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }
}
