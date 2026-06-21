package u6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import g2.n0;
import java.lang.reflect.Field;
import java.util.HashMap;
import m.o2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends r {
    private static final Property<View, PointF> BOTTOM_RIGHT_ONLY_PROPERTY;
    private static final Property<g, PointF> BOTTOM_RIGHT_PROPERTY;
    private static final Property<Drawable, PointF> DRAWABLE_ORIGIN_PROPERTY;
    private static final Property<View, PointF> POSITION_PROPERTY;
    private static final Property<View, PointF> TOP_LEFT_ONLY_PROPERTY;
    private static final Property<g, PointF> TOP_LEFT_PROPERTY;
    private static l sRectEvaluator;
    private static final String[] sTransitionProperties = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private int[] mTempLocation = new int[2];
    private boolean mResizeClip = false;
    private boolean mReparent = false;

    static {
        c cVar = new c(PointF.class, "boundsOrigin");
        cVar.f34253a = new Rect();
        DRAWABLE_ORIGIN_PROPERTY = cVar;
        TOP_LEFT_PROPERTY = new o2(1, PointF.class, "topLeft");
        BOTTOM_RIGHT_PROPERTY = new o2(2, PointF.class, "bottomRight");
        BOTTOM_RIGHT_ONLY_PROPERTY = new o2(3, PointF.class, "bottomRight");
        TOP_LEFT_ONLY_PROPERTY = new o2(4, PointF.class, "topLeft");
        POSITION_PROPERTY = new o2(5, PointF.class, "position");
        sRectEvaluator = new l();
    }

    @Override // u6.r
    public void captureEndValues(z zVar) {
        e(zVar);
    }

    @Override // u6.r
    public void captureStartValues(z zVar) {
        e(zVar);
    }

    @Override // u6.r
    public Animator createAnimator(ViewGroup viewGroup, z zVar, z zVar2) {
        int i;
        int i10;
        Rect rect;
        boolean z5;
        ObjectAnimator objectAnimator;
        Animator animator;
        ObjectAnimator objectAnimatorOfObject;
        z matchedTransitionValues;
        if (zVar != null) {
            HashMap map = zVar.f34309a;
            if (zVar2 != null) {
                HashMap map2 = zVar2.f34309a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = zVar2.f34310b;
                    if (!this.mReparent || ((matchedTransitionValues = getMatchedTransitionValues(viewGroup2, true)) != null ? viewGroup3 == matchedTransitionValues.f34310b : viewGroup2 == viewGroup3)) {
                        Rect rect2 = (Rect) map.get("android:changeBounds:bounds");
                        Rect rect3 = (Rect) map2.get("android:changeBounds:bounds");
                        int i11 = rect2.left;
                        int i12 = rect3.left;
                        int i13 = rect2.top;
                        int i14 = rect3.top;
                        int i15 = rect2.right;
                        int i16 = rect3.right;
                        int i17 = rect2.bottom;
                        int i18 = rect3.bottom;
                        int i19 = i15 - i11;
                        int i20 = i17 - i13;
                        int i21 = i16 - i12;
                        int i22 = i18 - i14;
                        Rect rect4 = (Rect) map.get("android:changeBounds:clip");
                        Rect rect5 = (Rect) map2.get("android:changeBounds:clip");
                        if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
                            i = 0;
                        } else {
                            i = (i11 == i12 && i13 == i14) ? 0 : 1;
                            if (i15 != i16 || i17 != i18) {
                                i++;
                            }
                        }
                        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                            i++;
                        }
                        if (i <= 0) {
                            return null;
                        }
                        if (this.mResizeClip) {
                            b0.a(view, i11, i13, Math.max(i19, i21) + i11, Math.max(i20, i22) + i13);
                            ObjectAnimator objectAnimatorOfObject2 = (i11 == i12 && i13 == i14) ? null : ObjectAnimator.ofObject(view, (Property<View, V>) POSITION_PROPERTY, (TypeConverter) null, getPathMotion().a(i11, i13, i12, i14));
                            if (rect4 == null) {
                                i10 = 0;
                                rect = new Rect(0, 0, i19, i20);
                            } else {
                                i10 = 0;
                                rect = rect4;
                            }
                            Rect rect6 = rect5 == null ? new Rect(i10, i10, i21, i22) : rect5;
                            if (rect.equals(rect6)) {
                                z5 = true;
                                objectAnimator = null;
                            } else {
                                Field field = n0.f19900a;
                                view.setClipBounds(rect);
                                ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(view, "clipBounds", sRectEvaluator, rect, rect6);
                                z5 = true;
                                objectAnimatorOfObject3.addListener(new e(view, rect5, i12, i14, i16, i18));
                                objectAnimator = objectAnimatorOfObject3;
                            }
                            boolean z10 = y.f34306a;
                            if (objectAnimatorOfObject2 == null) {
                                animator = objectAnimator;
                            } else if (objectAnimator == null) {
                                animator = objectAnimatorOfObject2;
                            } else {
                                AnimatorSet animatorSet = new AnimatorSet();
                                Animator[] animatorArr = new Animator[2];
                                animatorArr[0] = objectAnimatorOfObject2;
                                animatorArr[z5 ? 1 : 0] = objectAnimator;
                                animatorSet.playTogether(animatorArr);
                                animator = animatorSet;
                            }
                        } else {
                            b0.a(view, i11, i13, i15, i17);
                            if (i != 2) {
                                objectAnimatorOfObject = (i11 == i12 && i13 == i14) ? ObjectAnimator.ofObject(view, (Property<View, V>) BOTTOM_RIGHT_ONLY_PROPERTY, (TypeConverter) null, getPathMotion().a(i15, i17, i16, i18)) : ObjectAnimator.ofObject(view, (Property<View, V>) TOP_LEFT_ONLY_PROPERTY, (TypeConverter) null, getPathMotion().a(i11, i13, i12, i14));
                            } else if (i19 == i21 && i20 == i22) {
                                objectAnimatorOfObject = ObjectAnimator.ofObject(view, (Property<View, V>) POSITION_PROPERTY, (TypeConverter) null, getPathMotion().a(i11, i13, i12, i14));
                            } else {
                                g gVar = new g();
                                gVar.f34281e = view;
                                ObjectAnimator objectAnimatorOfObject4 = ObjectAnimator.ofObject(gVar, (Property<g, V>) TOP_LEFT_PROPERTY, (TypeConverter) null, getPathMotion().a(i11, i13, i12, i14));
                                ObjectAnimator objectAnimatorOfObject5 = ObjectAnimator.ofObject(gVar, (Property<g, V>) BOTTOM_RIGHT_PROPERTY, (TypeConverter) null, getPathMotion().a(i15, i17, i16, i18));
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                animatorSet2.playTogether(objectAnimatorOfObject4, objectAnimatorOfObject5);
                                animatorSet2.addListener(new d(gVar));
                                z5 = true;
                                animator = animatorSet2;
                            }
                            z5 = true;
                            animator = objectAnimatorOfObject;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            a0.e.u(viewGroup4, z5);
                            addListener(new f(viewGroup4));
                        }
                        return animator;
                    }
                    int iIntValue = ((Integer) map.get("android:changeBounds:windowX")).intValue();
                    int iIntValue2 = ((Integer) map.get("android:changeBounds:windowY")).intValue();
                    int iIntValue3 = ((Integer) map2.get("android:changeBounds:windowX")).intValue();
                    int iIntValue4 = ((Integer) map2.get("android:changeBounds:windowY")).intValue();
                    if (iIntValue != iIntValue3 || iIntValue2 != iIntValue4) {
                        viewGroup.getLocationInWindow(this.mTempLocation);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                        view.draw(new Canvas(bitmapCreateBitmap));
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                        float fR = b0.f34251a.r(view);
                        b0.b(view, 0.0f);
                        viewGroup.getOverlay().add(bitmapDrawable);
                        k pathMotion = getPathMotion();
                        int[] iArr = this.mTempLocation;
                        int i23 = iArr[0];
                        int i24 = iArr[1];
                        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, PropertyValuesHolder.ofObject(DRAWABLE_ORIGIN_PROPERTY, (TypeConverter) null, pathMotion.a(iIntValue - i23, iIntValue2 - i24, iIntValue3 - i23, iIntValue4 - i24)));
                        objectAnimatorOfPropertyValuesHolder.addListener(new b(viewGroup, bitmapDrawable, view, fR));
                        return objectAnimatorOfPropertyValuesHolder;
                    }
                }
            }
        }
        return null;
    }

    public final void e(z zVar) {
        View view = zVar.f34310b;
        HashMap map = zVar.f34309a;
        Field field = n0.f19900a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
        if (this.mReparent) {
            view.getLocationInWindow(this.mTempLocation);
            map.put("android:changeBounds:windowX", Integer.valueOf(this.mTempLocation[0]));
            map.put("android:changeBounds:windowY", Integer.valueOf(this.mTempLocation[1]));
        }
        if (this.mResizeClip) {
            map.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // u6.r
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }
}
