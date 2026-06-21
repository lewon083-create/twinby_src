package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class iz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f6653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f6654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f6655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f6656h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f6657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f6658k;

    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6649a++;
            this.f6655g = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.f6653e = motionEvent.getRawX();
            this.f6654f = motionEvent.getRawY();
            this.f6656h = motionEvent.getX();
            this.i = motionEvent.getY();
            this.f6657j = motionEvent.getRawX();
            this.f6658k = motionEvent.getRawY();
            return;
        }
        if (action == 1) {
            this.f6651c++;
            this.f6655g = Math.hypot(((double) motionEvent.getRawX()) - this.f6653e, ((double) motionEvent.getRawY()) - this.f6654f) + this.f6655g;
            this.f6653e = motionEvent.getRawX();
            this.f6654f = motionEvent.getRawY();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            this.f6652d++;
            return;
        }
        this.f6650b += (long) (motionEvent.getHistorySize() + 1);
        this.f6655g = Math.hypot(((double) motionEvent.getRawX()) - this.f6653e, ((double) motionEvent.getRawY()) - this.f6654f) + this.f6655g;
        this.f6653e = motionEvent.getRawX();
        this.f6654f = motionEvent.getRawY();
    }
}
