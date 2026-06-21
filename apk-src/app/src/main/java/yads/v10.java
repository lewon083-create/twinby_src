package yads;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.mobile.ads.R$styleable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v10 {
    public static u10 a(Context context, View view, AttributeSet attributeSet, int i) {
        float dimensionPixelSize;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalRoundImageView, i, 0);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalRoundImageView_monetization_internal_corner_radius, 0);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            dimensionPixelSize = 0.0f;
        }
        float f10 = dimensionPixelSize;
        return new u10(view, f10, f10, f10, f10);
    }
}
