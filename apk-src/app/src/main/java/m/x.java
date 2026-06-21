package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class x extends ImageView {
    private final o mBackgroundTintHelper;
    private boolean mHasLevel;
    private final w mImageHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        s2.a(context);
        this.mHasLevel = false;
        r2.a(getContext(), this);
        o oVar = new o(this);
        this.mBackgroundTintHelper = oVar;
        oVar.d(attributeSet, i);
        w wVar = new w(this);
        this.mImageHelper = wVar;
        wVar.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            oVar.a();
        }
        w wVar = this.mImageHelper;
        if (wVar != null) {
            wVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        t2 t2Var;
        w wVar = this.mImageHelper;
        if (wVar == null || (t2Var = wVar.f28389b) == null) {
            return null;
        }
        return (ColorStateList) t2Var.f28367c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        t2 t2Var;
        w wVar = this.mImageHelper;
        if (wVar == null || (t2Var = wVar.f28389b) == null) {
            return null;
        }
        return (PorterDuff.Mode) t2Var.f28368d;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.f28388a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            oVar.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        w wVar = this.mImageHelper;
        if (wVar != null) {
            wVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        w wVar = this.mImageHelper;
        if (wVar != null && drawable != null && !this.mHasLevel) {
            wVar.f28390c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        w wVar2 = this.mImageHelper;
        if (wVar2 != null) {
            wVar2.a();
            if (this.mHasLevel) {
                return;
            }
            w wVar3 = this.mImageHelper;
            ImageView imageView = wVar3.f28388a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(wVar3.f28390c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        w wVar = this.mImageHelper;
        if (wVar != null) {
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
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        w wVar = this.mImageHelper;
        if (wVar != null) {
            wVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        w wVar = this.mImageHelper;
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
        w wVar = this.mImageHelper;
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
