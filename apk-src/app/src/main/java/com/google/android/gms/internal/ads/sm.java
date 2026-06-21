package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sm extends ym {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f10335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f10336k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f10338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f10339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10343h;
    public final int i;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        f10335j = Color.rgb(204, 204, 204);
        f10336k = iRgb;
    }

    public sm(String str, List list, Integer num, Integer num2, Integer num3, int i, int i10) {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        this.f10338c = new ArrayList();
        this.f10339d = new ArrayList();
        this.f10337b = str;
        for (int i11 = 0; i11 < list.size(); i11++) {
            um umVar = (um) list.get(i11);
            this.f10338c.add(umVar);
            this.f10339d.add(umVar);
        }
        this.f10340e = num != null ? num.intValue() : f10335j;
        this.f10341f = num2 != null ? num2.intValue() : f10336k;
        this.f10342g = num3 != null ? num3.intValue() : 12;
        this.f10343h = i;
        this.i = i10;
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String j() {
        return this.f10337b;
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final ArrayList l() {
        return this.f10339d;
    }
}
