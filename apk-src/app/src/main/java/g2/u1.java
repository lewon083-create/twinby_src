package g2;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class u1 {
    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo g(int i) {
        return new AccessibilityNodeInfo.CollectionInfo(i, 1, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo h(int i, boolean z5) {
        return new AccessibilityNodeInfo.CollectionItemInfo(i, 1, 0, 1, z5);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo v(int i) {
        return new AccessibilityNodeInfo.CollectionInfo(1, i, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo w(int i, boolean z5) {
        return new AccessibilityNodeInfo.CollectionItemInfo(0, 1, i, 1, z5);
    }
}
