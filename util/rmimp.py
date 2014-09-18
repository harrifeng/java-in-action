"""
Usage: python rmimp.py --pkg="addtwonumers"
"""
import optparse
import os
import fileinput
import sys
import re


class SolutionFile(object):
    def __init__(self, pkg_name):
        root_fd = os.path.split(os.path.dirname(os.path.realpath(__file__)))[0]
        spec_file = os.path.join(root_fd, ('src/main/java/org/hfeng/oj/leet' +
                                           '/%s/Solution.java') % pkg_name)
        self.path = spec_file

    def rm_impl(self):
        for line in fileinput.input([self.path], inplace=True):
            res = re.findall(r"public|package", line)
            if len(res) == 0:
                line = ""
            sys.stdout.write(line)


def main():
    parser = optparse.OptionParser(__doc__.strip())
    parser.add_option("--pkg",
                      help="package name",
                      dest="pkg",
                      default="addtwonumbers")
    (opts, args) = parser.parse_args()
    g_pkg_name = opts.pkg
    sf = SolutionFile(opts.pkg)
    print sf.path
    sf.rm_impl()


if __name__ == '__main__':
    main()
