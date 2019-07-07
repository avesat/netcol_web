package com.training.netcol_web.service;

import com.training.netcol_web.model.RouteCmd;
import com.training.netcol_web.model.RouteCmdResponse;
import org.antlr.v4.runtime.CharStream;

public interface RouteService {
    RouteCmd parseRouteCmd(CharStream charStream);
    RouteCmd parseRouteCmd(String str);
    String getParseStatus();
    RouteCmdResponse sendRouteCmd(RouteCmd routeCmd);
}
