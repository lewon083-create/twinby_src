package org.chromium.support_lib_boundary;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    boolean getIncludeCookiesOnIntercept();

    void setAllowContentAccess(boolean z5);

    void setAllowFileAccess(boolean z5);

    void setBlockNetworkLoads(boolean z5);

    void setCacheMode(int i);

    void setIncludeCookiesOnIntercept(boolean z5);
}
