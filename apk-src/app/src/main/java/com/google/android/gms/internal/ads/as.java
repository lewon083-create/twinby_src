package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class as implements w9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f3361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wm f3364d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3366f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f3365e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f3367g = new HashMap();

    public as(HashSet hashSet, boolean z5, int i, wm wmVar, List list, boolean z10) {
        this.f3361a = hashSet;
        this.f3362b = z5;
        this.f3363c = i;
        this.f3364d = wmVar;
        this.f3366f = z10;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER, 3);
                    if (strArrSplit.length == 3) {
                        String str2 = strArrSplit[2];
                        if ("true".equals(str2)) {
                            this.f3367g.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(str2)) {
                            this.f3367g.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f3365e.add(str);
                }
            }
        }
    }

    @Override // w9.d
    public final int a() {
        return this.f3363c;
    }

    @Override // w9.d
    public final boolean b() {
        return this.f3366f;
    }

    @Override // w9.d
    public final boolean c() {
        return this.f3362b;
    }

    @Override // w9.d
    public final Set d() {
        return this.f3361a;
    }
}
