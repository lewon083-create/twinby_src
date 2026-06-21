package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.widget.ContentLoadingProgressBar;
import j2.b;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f1331d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f1332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1333c;

    /* JADX WARN: Type inference failed for: r2v1, types: [j2.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [j2.b] */
    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final int i = 0;
        this.f1332b = new Runnable(this) { // from class: j2.b

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ContentLoadingProgressBar f26183c;

            {
                this.f26183c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i10 = i;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f26183c;
                switch (i10) {
                    case 0:
                        int i11 = ContentLoadingProgressBar.f1331d;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i12 = ContentLoadingProgressBar.f1331d;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f1333c = new Runnable(this) { // from class: j2.b

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ContentLoadingProgressBar f26183c;

            {
                this.f26183c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i10;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f26183c;
                switch (i102) {
                    case 0:
                        int i11 = ContentLoadingProgressBar.f1331d;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i12 = ContentLoadingProgressBar.f1331d;
                        contentLoadingProgressBar.getClass();
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f1332b);
        removeCallbacks(this.f1333c);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1332b);
        removeCallbacks(this.f1333c);
    }
}
