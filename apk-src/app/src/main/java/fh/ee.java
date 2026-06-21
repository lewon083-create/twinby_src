package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ee implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17145a;

    public ee(sy syVar) {
        this.f17145a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ae resolve(ParsingContext parsingContext, ge geVar, JSONObject jSONObject) {
        Field field = geVar.f17270a;
        sy syVar = this.f17145a;
        if (((u6) JsonFieldResolver.resolveOptional(parsingContext, geVar.f17272c, jSONObject, "action_animation", syVar.f18522s1, syVar.f18503q1)) == null) {
            Expression expression = fe.f17196a;
        }
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.f17273d, jSONObject, "actions", syVar.f18464m1, syVar.f18443k1);
        Field field2 = geVar.f17274e;
        TypeHelper typeHelper = fe.f17205k;
        v0 v0Var = v0.f18733v;
        Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_horizontal", typeHelper, v0Var);
        Field field3 = geVar.f17275f;
        TypeHelper typeHelper2 = fe.f17206l;
        v0 v0Var2 = v0.f18734w;
        Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alignment_vertical", typeHelper2, v0Var2);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, geVar.f17276g, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, fe.f17211q, fe.f17196a);
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.f17277h, jSONObject, "animators", syVar.v1, syVar.f18533t1);
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.f17278j, jSONObject, A2.f22054g, syVar.H1, syVar.F1);
        Field field4 = geVar.f17280l;
        TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "capture_focus_on_action", typeHelper3, function1, fe.f17197b);
        Field field5 = geVar.f17281m;
        TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper4, function12, fe.f17212r);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, geVar.f17282n, jSONObject, "content_alignment_horizontal", fe.f17207m, v0Var, fe.f17198c);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, geVar.f17283o, jSONObject, "content_alignment_vertical", fe.f17208n, v0Var2, fe.f17199d);
        List listResolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, geVar.f17284p, jSONObject, "disappear_actions", syVar.Q2, syVar.O2);
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.f17285q, jSONObject, "doubletap_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.f17286r, jSONObject, "extensions", syVar.f18358c3, syVar.f18335a3);
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.f17288t, jSONObject, "functions", syVar.J3, syVar.H3);
        JsonFieldResolver.resolveExpression(parsingContext, geVar.f17289u, jSONObject, "gif_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        lo loVar = (lo) JsonFieldResolver.resolveOptional(parsingContext, geVar.f17290v, jSONObject, "height", syVar.V6, syVar.T6);
        if (loVar == null) {
            loVar = fe.f17200e;
        }
        lo loVar2 = loVar;
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.f17291w, jSONObject, "hover_end_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.f17292x, jSONObject, "hover_start_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.A, jSONObject, "longtap_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, geVar.D, jSONObject, "placeholder_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, fe.f17201f);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, geVar.E, jSONObject, "preload_required", typeHelper3, function1, fe.f17202g);
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.F, jSONObject, "press_end_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.G, jSONObject, "press_start_actions", syVar.f18464m1, syVar.f18443k1);
        Field field6 = geVar.H;
        TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "preview", typeHelper5);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, geVar.I, jSONObject, "reuse_id", typeHelper5);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, geVar.J, jSONObject, "row_span", typeHelper4, function12, fe.f17213s);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, geVar.K, jSONObject, "scale", fe.f17209o, be.f16940z, fe.f17203h);
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.L, jSONObject, "selected_actions", syVar.f18464m1, syVar.f18443k1);
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.M, jSONObject, "tooltips", syVar.Q8, syVar.O8);
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.R, jSONObject, "transition_triggers", kv.f17646g, fe.f17214t);
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.S, jSONObject, "variable_triggers", syVar.W8, syVar.U8);
        JsonFieldResolver.resolveOptionalList(parsingContext, geVar.T, jSONObject, "variables", syVar.c9, syVar.f18341a9);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, geVar.U, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, fe.f17210p, kv.f17653o, fe.i);
        yw ywVar = (yw) JsonFieldResolver.resolveOptional(parsingContext, geVar.V, jSONObject, "visibility_action", syVar.f18490o9, syVar.m9);
        List listResolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, geVar.W, jSONObject, "visibility_actions", syVar.f18490o9, syVar.m9);
        lo loVar3 = (lo) JsonFieldResolver.resolveOptional(parsingContext, geVar.X, jSONObject, "width", syVar.V6, syVar.T6);
        if (loVar3 == null) {
            loVar3 = fe.f17204j;
        }
        return new ae(expressionResolveOptionalExpression, expressionResolveOptionalExpression2, listResolveOptionalList, loVar2, ywVar, listResolveOptionalList2, loVar3);
    }
}
