package io.sentry.util;

import io.sentry.HubAdapter;
import io.sentry.HubScopesWrapper;
import io.sentry.IScopes;
import io.sentry.Scopes;
import io.sentry.ScopesAdapter;
import io.sentry.Sentry;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ScopesUtil {
    public static void printScopesChain(@Nullable IScopes iScopes) {
        System.out.println("==========================================");
        System.out.println("=============== v Scopes v ===============");
        System.out.println("==========================================");
        printScopesChainInternal(iScopes);
        System.out.println("==========================================");
        System.out.println("=============== ^ Scopes ^ ===============");
        System.out.println("==========================================");
    }

    private static void printScopesChainInternal(@Nullable IScopes iScopes) {
        if (iScopes == null) {
            System.out.println("-");
            return;
        }
        if (iScopes instanceof Scopes) {
            Scopes scopes = (Scopes) iScopes;
            System.out.println(String.format("%-25s {g=%-25s, i=%-25s, c=%-25s} [%s]", scopes, scopes.getGlobalScope(), scopes.getIsolationScope(), scopes.getScope(), scopes.getCreator()));
            printScopesChainInternal(iScopes.getParentScopes());
            return;
        }
        if ((iScopes instanceof ScopesAdapter) || (iScopes instanceof HubAdapter)) {
            printScopesChainInternal(Sentry.getCurrentScopes());
            return;
        }
        if (iScopes instanceof HubScopesWrapper) {
            printScopesChainInternal(((HubScopesWrapper) iScopes).getScopes());
            return;
        }
        System.out.println("Hit unhandled Scopes class" + iScopes.getClass());
    }
}
