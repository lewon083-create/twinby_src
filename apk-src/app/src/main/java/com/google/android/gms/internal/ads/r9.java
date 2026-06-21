package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f9764e;

    public r9() {
        this.f9761b = -1;
        this.f9762c = -1;
        this.f9760a = null;
        this.f9764e = new ArrayList();
        this.f9763d = 1;
    }

    public void a() {
        int i = this.f9763d;
        this.f9763d = i == Integer.MIN_VALUE ? this.f9761b : i + this.f9762c;
        this.f9764e = this.f9760a + this.f9763d;
    }

    public void b() {
        if (this.f9763d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public void c(String str) {
        if (str == null || "".equals(str)) {
            this.f9760a = null;
            return;
        }
        if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
            this.f9760a = str;
        } else {
            u9.i.h("Invalid value passed to setMaxAdContentRating: ".concat(str));
        }
    }

    public void d(int i) {
        if (i == -1 || i == 0 || i == 1) {
            this.f9761b = i;
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 57);
        sb2.append("Invalid value passed to setTagForChildDirectedTreatment: ");
        sb2.append(i);
        u9.i.h(sb2.toString());
    }

    public void e(int i) {
        if (i == -1 || i == 0 || i == 1) {
            this.f9762c = i;
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 52);
        sb2.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
        sb2.append(i);
        u9.i.h(sb2.toString());
    }

    public void f() {
        int i = this.f9763d;
        int i10 = i == Integer.MIN_VALUE ? this.f9761b : i + this.f9762c;
        this.f9763d = i10;
        String str = this.f9760a;
        this.f9764e = l7.o.j(i10, str, new StringBuilder(str.length() + String.valueOf(i10).length()));
    }

    public void g() {
        if (this.f9763d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public r9(int i, int i10, int i11, int i12) {
        String str;
        switch (i12) {
            case 1:
                if (i != Integer.MIN_VALUE) {
                    str = i + "/";
                } else {
                    str = "";
                }
                this.f9760a = str;
                this.f9761b = i10;
                this.f9762c = i11;
                this.f9763d = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
                this.f9764e = "";
                break;
            default:
                this.f9760a = i != Integer.MIN_VALUE ? t.z.d(i, "/", new StringBuilder(String.valueOf(i).length() + 1)) : "";
                this.f9761b = i10;
                this.f9762c = i11;
                this.f9763d = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
                this.f9764e = "";
                break;
        }
    }

    public r9(int i, int i10) {
        this(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, i, i10, 1);
    }
}
