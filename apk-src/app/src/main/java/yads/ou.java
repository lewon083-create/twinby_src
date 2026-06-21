package yads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ou implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.OnClickListener f41724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f41727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f41728e;

    public ou(Context context, View.OnClickListener onClickListener) {
        this.f41724a = onClickListener;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f41725b = scaledTouchSlop * scaledTouchSlop;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f41724a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX();
        float y7 = motionEvent.getY();
        int i = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i == 0) {
            this.f41727d = x10;
            this.f41728e = y7;
            this.f41726c = true;
            return false;
        }
        if (i == 1) {
            if (this.f41726c) {
                this.f41724a.onClick(view);
            }
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                this.f41726c = false;
                return false;
            }
        } else if (this.f41726c) {
            int i10 = (int) (x10 - this.f41727d);
            int i11 = (int) (y7 - this.f41728e);
            if ((i11 * i11) + (i10 * i10) > this.f41725b) {
                this.f41726c = false;
            }
        }
        return false;
    }
}
