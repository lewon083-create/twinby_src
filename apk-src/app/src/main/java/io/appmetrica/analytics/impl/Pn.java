package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fn f22840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f22841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f22845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f22847h;

    public Pn(Fn fn, V v5, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f22840a = fn;
        this.f22841b = v5;
        this.f22842c = arrayList;
        this.f22843d = str;
        this.f22844e = str2;
        this.f22845f = map;
        this.f22846g = str3;
        this.f22847h = bool;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Fn fn = this.f22840a;
        if (fn != null) {
            for (Cl cl2 : fn.f22355c) {
                sb2.append("at " + cl2.f22231a + "." + cl2.f22235e + "(" + cl2.f22232b + StringUtils.PROCESS_POSTFIX_DELIMITER + cl2.f22233c + StringUtils.PROCESS_POSTFIX_DELIMITER + cl2.f22234d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f22840a + "\n" + sb2.toString() + '}';
    }
}
