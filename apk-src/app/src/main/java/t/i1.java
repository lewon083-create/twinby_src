package t;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Size f33107e = new Size(1920, 1080);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Size f33108f = new Size(320, 240);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f33109g = new Size(640, 480);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f33110h = new Object();
    public static volatile i1 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f33111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Size f33112b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.a f33113c = new m7.a(27);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7.a f33114d = new m7.a(26);

    public i1(Context context) {
        this.f33111a = (DisplayManager) context.getSystemService("display");
    }

    public static i1 b(Context context) {
        if (i == null) {
            synchronized (f33110h) {
                try {
                    if (i == null) {
                        i = new i1(context);
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public static Display d(Display[] displayArr, boolean z5) {
        Display display = null;
        int i10 = -1;
        for (Display display2 : displayArr) {
            if (!z5 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x * point.y;
                if (i11 > i10) {
                    display = display2;
                    i10 = i11;
                }
            }
        }
        return display;
    }

    public final Size a() {
        Size sizeE;
        Point point = new Point();
        c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = p0.b.f30754a;
        if (size.getHeight() * size.getWidth() < p0.b.a(f33108f)) {
            size = ((SmallDisplaySizeQuirk) this.f33114d.f28696c) != null ? (Size) SmallDisplaySizeQuirk.f1247a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = f33109g;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size3 = f33107e;
        if (height > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        if (((ExtraCroppingQuirk) this.f33113c.f28696c) != null && (sizeE = ExtraCroppingQuirk.e(g0.o2.f19705b)) != null) {
            if (sizeE.getHeight() * sizeE.getWidth() > size.getHeight() * size.getWidth()) {
                return sizeE;
            }
        }
        return size;
    }

    public final Display c(boolean z5) {
        Display[] displays = this.f33111a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayD = d(displays, z5);
        if (displayD == null && z5) {
            displayD = d(displays, false);
        }
        if (displayD != null) {
            return displayD;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Size e() {
        if (this.f33112b != null) {
            return this.f33112b;
        }
        this.f33112b = a();
        return this.f33112b;
    }
}
