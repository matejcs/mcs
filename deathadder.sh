#!/bin/sh

mouse=` xinput | grep DeathAdder | awk '{print $6}' | awk 'BEGIN {FS="=";} {print $2}'`
xinput --set-prop $mouse "Device Accel Constant Deceleration" 4
xinput --set-prop $mouse "Device Accel Velocity Scaling" 1
