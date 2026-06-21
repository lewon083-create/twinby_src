package com.google.android.gms.internal.ads;

import android.view.View;
import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class st1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10390f;

    public /* synthetic */ st1(int i, Object obj) {
        this.f10385a = i;
        this.f10390f = obj;
    }

    public void a() {
        this.f10387c = this.f10388d ? ((k6.h0) this.f10390f).g() : ((k6.h0) this.f10390f).k();
    }

    public void b(View view, int i) {
        if (this.f10388d) {
            int iB = ((k6.h0) this.f10390f).b(view);
            k6.h0 h0Var = (k6.h0) this.f10390f;
            this.f10387c = (Integer.MIN_VALUE == h0Var.f27087b ? 0 : h0Var.l() - h0Var.f27087b) + iB;
        } else {
            this.f10387c = ((k6.h0) this.f10390f).e(view);
        }
        this.f10386b = i;
    }

    public void c(View view, int i) {
        k6.h0 h0Var = (k6.h0) this.f10390f;
        int iL = Integer.MIN_VALUE == h0Var.f27087b ? 0 : h0Var.l() - h0Var.f27087b;
        if (iL >= 0) {
            b(view, i);
            return;
        }
        this.f10386b = i;
        if (!this.f10388d) {
            int iE = ((k6.h0) this.f10390f).e(view);
            int iK = iE - ((k6.h0) this.f10390f).k();
            this.f10387c = iE;
            if (iK > 0) {
                int iG = (((k6.h0) this.f10390f).g() - Math.min(0, (((k6.h0) this.f10390f).g() - iL) - ((k6.h0) this.f10390f).b(view))) - (((k6.h0) this.f10390f).c(view) + iE);
                if (iG < 0) {
                    this.f10387c -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (((k6.h0) this.f10390f).g() - iL) - ((k6.h0) this.f10390f).b(view);
        this.f10387c = ((k6.h0) this.f10390f).g() - iG2;
        if (iG2 > 0) {
            int iC = this.f10387c - ((k6.h0) this.f10390f).c(view);
            int iK2 = ((k6.h0) this.f10390f).k();
            int iMin = iC - (Math.min(((k6.h0) this.f10390f).e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.f10387c = Math.min(iG2, -iMin) + this.f10387c;
            }
        }
    }

    public void d(int i) {
        this.f10388d |= i > 0;
        this.f10386b += i;
    }

    public void e() {
        this.f10386b = -1;
        this.f10387c = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        this.f10388d = false;
        this.f10389e = false;
    }

    public void f(int i) {
        this.f10388d = 1 == ((this.f10388d ? 1 : 0) | i);
        this.f10386b += i;
    }

    public String toString() {
        switch (this.f10385a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.f10386b + ", mCoordinate=" + this.f10387c + ", mLayoutFromEnd=" + this.f10388d + ", mValid=" + this.f10389e + '}';
            default:
                return super.toString();
        }
    }

    public st1() {
        this.f10385a = 1;
        e();
    }
}
