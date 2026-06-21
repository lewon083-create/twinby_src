package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class v extends ImageButton {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f28381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f28382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        s2.a(context);
        this.f28383d = false;
        r2.a(getContext(), this);
        o oVar = new o(this);
        this.f28381b = oVar;
        oVar.d(attributeSet, i);
        w wVar = new w(this);
        this.f28382c = wVar;
        wVar.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f28381b;
        if (oVar != null) {
            oVar.a();
        }
        w wVar = this.f28382c;
        if (wVar != null) {
            wVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f28381b;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f28381b;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        t2 t2Var;
        w wVar = this.f28382c;
        if (wVar == null || (t2Var = wVar.f28389b) == null) {
            return null;
        }
        return (ColorStateList) t2Var.f28367c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        t2 t2Var;
        w wVar = this.f28382c;
        if (wVar == null || (t2Var = wVar.f28389b) == null) {
            return null;
        }
        return (PorterDuff.Mode) t2Var.f28368d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.f28382c.f28388a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f28381b;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o oVar = this.f28381b;
        if (oVar != null) {
            oVar.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        w wVar = this.f28382c;
        if (wVar != null) {
            wVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        w wVar = this.f28382c;
        if (wVar != null && drawable != null && !this.f28383d) {
            wVar.f28390c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (wVar != null) {
            wVar.a();
            if (this.f28383d) {
                return;
            }
            ImageView imageView = wVar.f28388a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(wVar.f28390c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f28383d = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        w wVar = this.f28382c;
        ImageView imageView = wVar.f28388a;
        if (i != 0) {
            Drawable drawableI = a.a.i(imageView.getContext(), i);
            if (drawableI != null) {
                w0.a(drawableI);
            }
            imageView.setImageDrawable(drawableI);
        } else {
            imageView.setImageDrawable(null);
        }
        wVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        w wVar = this.f28382c;
        if (wVar != null) {
            wVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f28381b;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f28381b;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        w wVar = this.f28382c;
        if (wVar != null) {
            if (wVar.f28389b == null) {
                wVar.f28389b = new t2();
            }
            t2 t2Var = wVar.f28389b;
            t2Var.f28367c = colorStateList;
            t2Var.f28366b = true;
            wVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        w wVar = this.f28382c;
        if (wVar != null) {
            if (wVar.f28389b == null) {
                wVar.f28389b = new t2();
            }
            t2 t2Var = wVar.f28389b;
            t2Var.f28368d = mode;
            t2Var.f28365a = true;
            wVar.a();
        }
    }
}
